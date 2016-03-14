# 通过反射获取子类泛型传入的类型的对象

    public class BaseActivity<P, V> {
        @Nullable
        public P getPresenter() {
            Class<P> pClazz = (Class<P>) ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
            P presenter;
            try {
                presenter = pClazz.newInstance();
                return presenter;
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return null;
        }

    }

这样子类的 `XXXActivity<P, V>` 传入依赖的Presenter和实现的View接口 就能直接通过getPresenter获取Presenter，避免了重复的new动作， 在BaseActivity中也能管理Presenter的生命周期， 完全不用子类考虑这类问题。

#### TODO

由于Android中Activity会因为各种原因被系统销毁， 所以presenter中的状态是需要有保存/回复机制的，否则数据会乱，保存Presenter机制有待设计


### 博客

从零开始的Android新项目1 - 架构搭建篇

http://blog.zhaiyifan.cn/2016/03/14/android-new-project-from-0-p1/
http://blog.zhaiyifan.cn/2016/03/14/android-new-project-from-0-p2/

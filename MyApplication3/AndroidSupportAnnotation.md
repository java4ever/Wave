# Android Support Annotation #

## 使用 ##

    dependencies {
      compile 'com.android.support:support-annotations:22.2.0'
    }

或者

    compile 'com.android.support:appcompat-v7:23.1.1'

<br>

---

# 分类 #

### Nullness Annotations

`@Nullable` `@NonNull`

### Resource Type Annotations

`@StringRes` `@DrawableRes` `@ColorRes` `@InterpolatorRes` `@InterpolatorRes`

### Typedef Annotations ###

`@IntDef` `@StringDef`

<br>

---

# 更新 #

### proguard keep ###

`@keep` 

### Threading Annotations ###

`@UiThread` `@MainThread` `@WorkerThread` `@BinderThread`

### Value Constraints ###

`@Size` `@IntRange` `@FloatRange`

collection must be non-empty: @Size(min=1)

that a String must be at most 23 characters: @Size(max=23)

that an array must have precisely 2 elements: @Size(2)

that an array must have a size that is a multiple of 2 (e.g. in the graphics APIs that take an array of points x/y positions: @Size(multiple=2)

### Permissions ###

`@RequiresPermission`

### Overriding Methods ###

`@CallSuper`

Activity

### Return Values ###

`@CheckResult`

<br>

---

`@VisibleForTesting`

参考链接: [原版] ， [中文翻译]

[原版]: http://tools.android.com/tech-docs/support-annotations
[中文翻译]: http://www.flysnow.org/2015/08/13/android-tech-docs-support-annotations.html
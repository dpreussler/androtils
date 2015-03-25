androtils
==============

some small utility classes


Gradle
======

```groovy
compile 'de.jodamob.android:androtils:0.1'

```


SafePhrase
==========
Runtime safe version of the Phrase class

Usage:
Same as Phrase:

```java
SafePhrase.from(...).put(...).format()
```

Will not crash if elements are not found. Will do a wtf log instead (when combined with Crashlytics
logger this would still send the stacktrace so you can fix it easily with next version).


https://github.com/square/phrase


Small helpers
====================================

check out helper classes

```java

ViewUtils.hideView(view1, view2,..)
ViewUtils.showView(view1, view2,..)
ViewUtils.removeView(view1, view2,..)
ViewUtils.showOrHide(condition, view1, view2...)
ViewUtils.showOrRemove(condition, view1, view2...)
```



Licensed under MIT license
(c) 2014, 2015 Danny Preussler

This software binds to other software, please acknowledge those copyrights
or make sure to exclude them at compile time:
Espresso and Android Copyright Google Inc.
OkHTTP, Picasso, Phrase Copyright Square, Inc.
Crashlytics, Copyright Crashlytics
New Relic, Copyright New Relic, Inc.


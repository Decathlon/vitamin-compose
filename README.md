> **❗ Important note: This current version of Vitamin will no longer evolve and only accept bug fixes from now on. [More details here](https://github.com/Decathlon/vitamin-design/blob/main/IMPORTANT_NOTE.md).**

<br />

<p align="center">
  <img
    width="300px"
    src="https://user-images.githubusercontent.com/9600228/102414461-e3b92b00-3ff6-11eb-9c96-5f37c4d5e02c.png#gh-light-mode-only"
    alt="Vitamin Decathlon Design System logo" />
  <img
    width="300px"
    src="https://user-images.githubusercontent.com/9600228/147513091-66fcc204-279b-4140-9be5-c16744c0f637.png#gh-dark-mode-only"
    alt="Vitamin Decathlon Design System logo" />
</p>

<h1 align="center">Vitamin Compose</h1>

<p align="center">Decathlon Design System libraries for android applications</p>

<p align="center">
  <a href="https://www.decathlon.design">Website</a>
</p>

<p align="center">
  <a aria-label="contributors graph" href="https://github.com/Decathlon/vitamin-compose/graphs/contributors">
    <img src="https://img.shields.io/github/contributors/decathlon/vitamin-compose.svg">
  </a>
  <a aria-label="last commit" href="https://github.com/Decathlon/vitamin-compose/commits">
    <img alt="" src=
  "https://img.shields.io/github/last-commit/decathlon/vitamin-compose.svg">
  </a>
  <a aria-label="license" href="https://github.com/Decathlon/vitamin-compose/blob/main/LICENSE">
    <img src="https://img.shields.io/github/license/decathlon/vitamin-compose.svg" alt="">
  </a>
  <a aria-label="slack" href="https://join.slack.com/t/decathlon-design/shared_invite/zt-13kxb50ar-iHzqV~Olsu4~NCkEPj5c4g">
    <img src="https://img.shields.io/badge/slack-Decathlon%20Design%20System-purple.svg?logo=slack" alt="">
  </a>
</p>

Compose Decathlon Design System is based on Material Design compose artifact described
on the [official documentation](https://material.io/) and maintained by Google developers
and designers.

But these native components are overridden to respect Decathlon's Visual Identity. You'll find
the design specifications and technical information for supported platforms by Decathlon on
[decathlon.design](https://www.decathlon.design/). If you are interested by a sample,
you can install a demo with `sample` module in the technical project.

## 🚀 Getting Started

A `VitaminTheme` is available in foundation artifact from where you can get all
colors, typographies and shapes in your composable hierarchy. Note that this theme is
mandatory if you want to use any composable available in other vitamin compose artifacts.
If you don't use it, an error will be triggered at the runtime.

```kotlin
VitaminTheme {
  // Your composable declarations
}
```

## 📥 Download

Release artifacts are available on Maven Central. Check the [release page](https://github.com/Decathlon/vitamin-compose/releases)
to know what is the latest release version of Vitamin artifacts.

```kotlin
repositories {
    mavenCentral()
}

implementation("com.decathlon.vitamin.compose:<component>:<last_version>")
```

If you want to test latest changes merge in `main` branch, you can test Vitamin Android from
snapshot artifacts but we don't recommend to use theses artifacts in production where you can
have regressions or breaking changes until the next official release.

```kotlin
repositories {
    maven {
        url = uri("https://oss.sonatype.org/content/repositories/snapshots/")
    }
}

implementation("com.decathlon.vitamin.compose:<component>:<latest-major + 1>.0.0-SNAPSHOT")
```

If you have any question about the versioning of this project, you can just read our [documentation](https://github.com/Decathlon/vitamin-compose/tree/main/VERSIONING.md)
about it.

## Special thanks

Thank you to the [contributors](https://github.com/Decathlon/vitamin-compose/graphs/contributors) involved in these vitamin-compose libraries. 💙

<a href="https://github.com/decathlon/vitamin-compose/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=decathlon/vitamin-compose" />
</a>

Thank you also [Remix Icon](https://remixicon.com) because Vitamix Icons is the official Decathlon icon library based on their [open-source icon library](https://github.com/Remix-Design/RemixIcon) (Remix Design © 2020). This original library is under the license Apache 2.0 and has been modified by Decathlon. [Learn more](https://www.decathlon.design/726f8c765/p/58575f-vitamix-license).

## License

    Copyright 2022 Decathlon.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

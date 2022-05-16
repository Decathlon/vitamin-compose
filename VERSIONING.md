# Versioning

This project is deployed in release and snapshot modes. Both have their own versioning strategy.

## Release mode

At each tag pushed on the GitHub repository, our CI will be triggered to assemble all modules and
publish artifacts on Maven Central. In all cases, a status will be published on `#vitamin-compose`
channel in the Vitamin slack to know if the publication is okay or not.

### Format

The format of a release version name match this regex: `[0-9]+.[0-9]+.[0-9]+(-(alpha|beta)[0-9]{2,})?`

* The first digit is used for the major version
* The second digit is used for the minor version
* The third digit is used for the hotfix version
* Optionally, you can have an alpha or beta keyword with an iterative number

### Alpha vs Beta vs Production

Alpha version concerns modules which need a dependency in alpha or if the component doesn't come
from material component android dependency because it is a Decathlon custom component.

Beta version concerns new modules where we need tests and feedback from end users to know if
everything is okay.

Production version means that the artifact can be used as a final release and can be integrated
without any risk in an android project.

### Lifecycle

The versioning lifecycle is pretty simple. Optionally you can be in alpha. After, you pass in
beta and finally, you are in production but alpha and beta are inherited. It means that:

* if a module A is in alpha or beta and is used by module B, this last module need to be in alpha or
  beta.
* if a module A is in alpha, a module B is in beta and are used by module C, this last module need
  to be in alpha because it is the lowest version in the dependency graph.

After each alpha or beta release, we make a new version every 2 weeks and a module can proceed to
the next step (beta or production) if all dependencies aren't lowest or we feel that we have enough
feedback from end users. Otherwise, we just upgrade the version of the alpha or beta version.

Note that if we publish a major version of the project, all modules need to be ready for this big
version because we'll upgrade all versions of all modules to the new major version name. It isn't
the case for minor or hotfix versions where a module can be in 0.1.0 and another one can in 0.2.1.
Just the version impact the dependency graph, if a module A is in 0.1.0, a module B is in 0.2.1 and
are used by a module C, this last module need to be in 0.2.1 even if there is no change in the
content of the module C.

## Snapshot mode

At each push on the `main` branch, a snapshot will be generated and published on snapshot maven
registry in Maven Central.

### Format

The format of a snapshot version name match this regex: `[0-9]+.0.0-SNAPSHOT`

* The first digit is used for the major version
* The second digit is used for the minor version
* The third digit is used for the hotfix version
* Finish with `-SNAPSHOT` keyword

### Lifecycle

The versioning lifecycle is more simple that the release mode. We don't have alpha or beta
versions and we never upgrade minor or hotfix digit. We take the highest version name in the
dependency graph and we upgrade the major digit.

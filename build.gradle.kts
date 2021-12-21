tasks.create<Delete>("clean") {
    delete(rootProject.buildDir)
}

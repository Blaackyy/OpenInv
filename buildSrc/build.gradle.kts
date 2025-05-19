plugins {
  `kotlin-dsl`
}

repositories {
  gradlePluginPortal()
  mavenCentral()
}

dependencies {
  val libs = project.extensions.getByType(VersionCatalogsExtension::class.java).named("libs")
  implementation(libs.findLibrary("specialsource").orElseThrow())
  implementation(libs.findLibrary("errorprone-gradle").orElseThrow())
}

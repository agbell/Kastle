import sbt._

object Dependencies {
  lazy val catsVersion = "2.1.1"
  lazy val kafkaVersion = "2.5.0"

  lazy val slf4jApi = "org.slf4j" % "slf4j-api" % "1.7.30" exclude ("org.slf4j", "slf4j-log4j12")

  // Javax excluded and added specifially to avoid https://github.com/sbt/sbt/issues/3618
  // included explicitly to let us deal with vulns
  lazy val kafka        = "org.apache.kafka" % "kafka-clients" % kafkaVersion exclude ("org.slf4j", "slf4j-log4j12")
  lazy val kafkaRelated = Seq(kafka)

  lazy val embeddedKafka = "io.github.embeddedkafka" %% "embedded-kafka" % kafkaVersion

  lazy val catsCore = "org.typelevel" %% "cats-core" % catsVersion
  lazy val catsFree = "org.typelevel" %% "cats-free" % catsVersion

  lazy val catsEffect = "org.typelevel" %% "cats-effect" % "2.1.3"

  lazy val simulacrum = "org.typelevel" %% "simulacrum" % "1.0.0"

  lazy val scalaTest   = "org.scalatest" %% "scalatest"   % "3.1.2"
  lazy val mockitoCore = "org.mockito"   % "mockito-core" % "3.3.3"

  private val logbackVersion = "1.2.3"
  lazy val logbackClass      = "ch.qos.logback" % "logback-core" % logbackVersion
  lazy val logbackClassic    = "ch.qos.logback" % "logback-classic" % logbackVersion
  lazy val logbackRelated    = Seq(logbackClass, logbackClassic)

  lazy val silencerVersion = "1.6.0"
  lazy val silencerPlugin  = "com.github.ghik" % "silencer-plugin" % silencerVersion cross CrossVersion.full
  lazy val kindProjector   = "org.typelevel" % "kind-projector" % "0.11.0" cross CrossVersion.full

}

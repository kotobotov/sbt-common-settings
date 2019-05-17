addSbtPlugin("com.github.gseitz"      % "sbt-release"         % "1.0.11") // пайплайн выкатывания продукта в прод используя sbt
addSbtPlugin("com.typesafe.sbt"       % "sbt-native-packager" % "1.3.15") // основная схема по упаковке кода в продукт под различные платформы в том числе в контейнер
addSbtPlugin("com.sksamuel.scapegoat" %% "sbt-scapegoat"      % "1.0.9") // статический анализатор (варт ремувер не использую тк черезчур категоричный вплоть до запрета любых мутабельных переменных, хотя это все настраивается везде)
//также необходимо указать в билдСБТ:
//scapegoatVersion in ThisBuild := "1.3.8"
//scalaBinaryVersion in ThisBuild := "2.12"
//для использования пишем: scapegoat

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.1") // оценивает покрытие тестами https://github.com/scoverage/sbt-scoverage
//использование:
//sbt clean coverage test
//sbt coverageReport
//лучше вариант:
//добавить в билдСБТ следующее:
//addCommandAlias("testc", ";clean;coverage;test;coverageReport") // для удобного запуска оценки покрытия тестами
//coverageExcludedPackages := "Main" // убираем маин из оценки покрытия, тк там как правило одни вызовы, а это мы не тестируем)

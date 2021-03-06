name := "sbt-common-settings"

version := "0.1"

scalaVersion := "2.12.8"

triggeredMessage := Watched.clearWhenTriggered // очищать консоль при перезапуске находясь внутри (повторяющегося процесса, типа непрерывного теста ~ )

libraryDependencies ++=
  Seq("org.scalatest" %% "scalatest" % "3.0.7" % "test", // http://www.scalatest.org/
      "org.pegdown"   % "pegdown"    % "1.6.0" % "test" // https://github.com/sirthias/pegdown/ требуется для генерации отчетов теста
  )

testOptions in Test ++=
  Seq(Tests.Argument(TestFrameworks.ScalaTest, "-oSD"), // вывод к каждому тесту времени исполнения теста
      Tests.Argument(TestFrameworks.ScalaTest, "-h", "target/test-reports") // создание репорта после теста
  )

scapegoatVersion in ThisBuild := "1.3.8"
scalaBinaryVersion in ThisBuild := "2.12"

addCommandAlias("testc", ";clean;coverage;test;coverageReport") // добавляет комманду testc для удобного запуска оценки покрытия тестами
coverageExcludedPackages := "Main" // убираем маин из оценки покрытия, работает только со Сковарэдж плагином, тк там как правило одни вызовы, а это мы не тестируем)
logLevel in compile := Level.Error // убираем варнинги при компиляции (не нужны, забивают только лог), с варнингами на тесте работаем

// опции для ускорения сборки
updateOptions in Global := updateOptions.in(Global).value.withCachedResolution(true) // ускоряем на локальных компьютерах загрузку зависимостей
updateOptions in Global := updateOptions.in(Global).value.withLatestSnapshots(false) // не искать при сборке каждый раз самый последний снапшот зависимости

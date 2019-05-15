//addSbtPlugin("net.virtual-void"        % "sbt-optimizer"         % "0.1.2") // анализирует время проведенное при компиляции задач для включения необходимо в билд сбт добавить:  enablePlugins(net.virtualvoid.optimizer.SbtOptimizerPlugin) поэтому нельзя использовать в коммон.сбт (будет ошибка на проекте у кого нет этого плагина) работает автоматически при компиляции
addSbtPlugin("ch.epfl.scala"           % "sbt-scalafix"          % "0.9.4") // автоматический рефакторинг ()
addSbtPlugin("com.timushev.sbt"        % "sbt-updates"           % "0.4.0") // анализирует зависимости для этого используем dependencyUpdates для использования в sbt dependencyUpdates
addSbtPlugin("com.typesafe.sbt"        % "sbt-git"               % "1.0.0") // позволяет выполнять команды гита внутри сбт
addSbtPlugin("net.virtual-void"        % "sbt-dependency-graph"  % "0.9.2") // визуализация зависимостей для использования пишем
addSbtPlugin("io.spray"                % "sbt-revolver"          % "0.9.1") // позволяет быстро перезапускать код  для использования пишем в сбт: ~reStart или ~reTest
addSbtPlugin("org.duhemm"              % "sbt-errors-summary"    % "0.6.3") // симпатичный формат вывода сообщений об ошибках, снижение мусора, более конкретное указание где ошибка, использование автоматическое при компилировании
addSbtPlugin("com.orrsella"            % "sbt-stats"             % "1.0.7") // общая статистика по коду (размер комментариев, кода, общая информация) для использования пишем: stats
addSbtPlugin("com.github.sbt"          % "sbt-duplicates-finder" % "1.0.0") // поиск конфликтующих зависимостей (для использования : checkDuplicates)
addSbtPlugin("com.softwaremill.clippy" % "plugin-sbt"            % "0.6.1") // богатая информация об ошибках (стаковерфлоу прямо в консоле)

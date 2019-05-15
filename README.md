# SBT-COMMON-SETTINGS

набор используемых планигов для SBT.

##СОСТАВ
две части - 
1. `project/common.sbt` - его лучше всего использовать в качестве глобальных настроек для всех проектов sbt без явного указания
для этого вам скопировать фаил `common.sbt` в `~/.sbt/0.13/plugins/plugins.sbt` для sbt 0.13 или в `~/.sbt/1.0/plugins/plugins.sbt` для sbt 1.0

2. `project/plugins.sbt` - плагины, которые лучше добавлять к самому проекту, т.к. необоходимо чтоб они, например, работали на сервере при компиляции. 
 

###ENGLISH
`project/common.sbt` - install it as a global plugin so that you can use it in any SBT project without the need to explicitly add it to each one. To do this, add the plugin dependency to `~/.sbt/0.13/plugins/plugins.sbt` for sbt 0.13 or `~/.sbt/1.0/plugins/plugins.sbt` for sbt 1.0:
`project/plugins.sbt` - use it just for regular project plugins 
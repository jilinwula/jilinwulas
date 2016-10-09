# sping-quartz 笔记

    quartz包括调度器、任务、触发器

* Job：一个接口，只有一个方法，开发者实现该接口定义需要执行的任务

* JobDetail：Job的实现类

* Trigger:时间出发规则
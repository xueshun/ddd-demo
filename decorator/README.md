# 富含知识模型（装饰者）

## 优势
1. 把不同的上下文中的逻辑分别富集于不同的角色对象中

当我们需要改动代码时，只需要找到对应上下文中的角色对象，在角色对象中进行修改即可。这一方面解决了认知过载的问题，避免了模型僵化。
另一方面，因为角色对象的封装，代码的改变并不会进行传播。

2. 从实体对象到角色对象经由显示的方法调用（asBuyer、asReader、asContact），这实际上是上下文的切换

## 劣势

我们将 asContact 方法置于 UserRepositoryDB 之内，就显得不那么合适了。
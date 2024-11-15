<template>
  <header>
    <nav>
      <h1>My Steam-Like Website</h1>
      <ul>
        <li><router-link to="/">Home</router-link></li>
      </ul>
    </nav>
  </header>
</template>

<style>
header {
  background-color: #333;
  color: white;
  padding: 1rem;
  text-align: center;
}
nav ul {
  list-style: none;
  padding: 0;
}
nav li {
  display: inline;
  margin: 0 1rem;
}
</style>

<!-- 未来开发建议：
1. 将导航栏扩展为更复杂的菜单，包括用户登录/注册、游戏分类、搜索栏等。
2. 添加一个“用户头像”或“用户菜单”组件，提供用户设置选项。
-->

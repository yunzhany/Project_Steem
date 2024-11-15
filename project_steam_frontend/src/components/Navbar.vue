<template>
  <nav class="navbar">
    <div class="logo">Steam Clone</div>
    <ul class="nav-links">
      <li><router-link to="/">Home</router-link></li>
      <li><router-link to="/store">Store</router-link></li>
      <li><router-link to="/community">Community</router-link></li>
      <li><router-link to="/login">Login</router-link></li>
    </ul>
  </nav>
</template>

<style>
.navbar {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 10px 20px;
  background-color: #1b2838;
  color: white;
}
.nav-links {
  list-style: none;
  display: flex;
}
.nav-links li {
  margin: 0 15px;
}
</style>

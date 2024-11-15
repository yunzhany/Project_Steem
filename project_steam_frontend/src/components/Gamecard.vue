<template>
  <div class="game-card">
    <img :src="game.image" alt="Game Cover" />
    <h3>{{ game.name }}</h3>
    <p>{{ game.description }}</p>
  </div>
</template>

<script>
export default {
  props: {
    game: Object
  }
};
</script>

<style>
.game-card {
  border: 1px solid #ccc;
  padding: 1rem;
  border-radius: 5px;
  text-align: left;
}
.game-card img {
  width: 100%;
  border-radius: 5px;
}
</style>

<!-- 未来开发建议：
1. 在卡片上添加“添加到愿望单”或“购买”按钮。
2. 实现鼠标悬停效果，显示更多游戏信息或动画效果。
-->

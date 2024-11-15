<template>
  <div>
    <h2>Featured Games</h2>
    <div class="game-list">
      <GameCard v-for="game in games" :key="game.id" :game="game" />
    </div>
  </div>
</template>

<script>
import GameCard from '../components/GameCard.vue';

export default {
  components: {
    GameCard
  },
  data() {
    return {
      games: [
        {id: 1, name: 'Game 1', description: 'Exciting game 1', image: ''},
        {id: 2, name: 'Game 2', description: 'Thrilling game 2', image: ''}
      ]
    };
  }
};
</script>

<style>
.game-list {
  display: flex;
  gap: 1rem;
  flex-wrap: wrap;
}
</style>

<!-- 未来开发建议：
1. 将游戏数据改为从后端 API 获取，以支持动态更新。
2. 添加分页功能或按分类筛选游戏的功能。
-->

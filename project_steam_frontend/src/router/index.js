import { createRouter, createWebHistory } from 'vue-router';
import Home from '../views/Home.vue';
import GameDetail from '../views/GameDetail.vue';

const routes = [
    { path: '/', name: 'Home', component: Home },
    { path: '/game/:id', name: 'GameDetail', component: GameDetail }
];

const router = createRouter({
    history: createWebHistory(),
    routes
});

export default router;


<!-- 未来开发建议：
1. 在路由中添加更多页面，比如“用户个人中心”、“游戏库”、“购物车”等。
2. 实现路由守卫，保护需要身份验证的页面，并重定向未登录用户。
-->

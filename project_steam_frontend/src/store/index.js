import Vue from 'vue';
import Vuex from 'vuex';

Vue.use(Vuex);

export default new Vuex.Store({
    state: {
        user: null,
        games: []
    },
    mutations: {
        setUser(state, user) {
            state.user = user;
        },
        setGames(state, games) {
            state.games = games;
        }
    }
});

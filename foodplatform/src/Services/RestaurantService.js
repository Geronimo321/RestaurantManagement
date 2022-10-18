import axios from "axios";

const RESTAURANT_BASE_API_URL = "http://localhost:8080/restaurants";

class RestaurantService {
    getAllRestaurants(){
        return axios.get(RESTAURANT_BASE_API_URL);
    }

    addRestaurant(restaurant){
        return axios.post(RESTAURANT_BASE_API_URL, restaurant);
    }

    getRestaurantByID(restaurantId){
        return axios.get(RESTAURANT_BASE_API_URL +"/"+ restaurantId);
    }

    updateRestaurant(restaurantId, restaurant){
        return axios.get(RESTAURANT_BASE_API_URL +"/" + restaurantId, restaurant);
    }

    deleteRestaurant(restaurantId){
        return axios.delete(RESTAURANT_BASE_API_URL + "/" + restaurantId);
    }

}


export default new RestaurantService();
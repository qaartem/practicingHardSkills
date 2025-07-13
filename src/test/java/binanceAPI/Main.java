package binanceAPI;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://api.binance.com";

        Response response = RestAssured
                .given()
                .queryParam("symbol", "BTCUSDT")
                .queryParam("limit", 3)
                .when()
                .get("/api/v3/depth");
        if (response.statusCode() == 200){
            System.out.println(response.getBody().asPrettyString());
        } else {
            System.out.println("Status code: " + response.statusCode());
            System.out.println(response.getBody().asPrettyString());
        }

        System.out.println("getPriceForLevel3 bids: " + getPriceForLevel3(response, "bids"));
        System.out.println("getPriceForLevel3 asks: " + getPriceForLevel3(response, "asks"));
        System.out.println("getDealPrice bids marketOrder: " + getDealPrice(response, "bids", true));
        System.out.println("getDealPrice asks marketOrder: " + getDealPrice(response, "asks", true));
        System.out.println("getDealPrice bids: " + getDealPrice(response, "bids", false));
        System.out.println("getDealPrice asks: " + getDealPrice(response, "asks", false));
    }

    public static String getPriceForLevel3(Response response, String side){
        String path = side.equalsIgnoreCase("BIDS") ? "bids" : "asks";
        List<List<String>> orders = response.jsonPath().getList(path);
        if(orders.size() < 3){
            return "Level 3 doesn't exist";
        }
        List<String> level3 = orders.get(2);
        return level3.getFirst();
    }

    public static String getDealPrice(Response response, String side, boolean isMarketOrder){
        String path = side.equalsIgnoreCase("BIDS") ? "bids" : "asks";
        List<List<String>> orders = response.jsonPath().getList(path);
        if(orders.isEmpty()){
            return "orders is Empty";
        }

            if(isMarketOrder){
                return orders.getFirst().getFirst();
            } else {
                if(orders.size() < 3){
                    return "Level 3 doesn't exist";
                }
                return orders.get(2).getFirst();
            }
    }
}

package com.company;


import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import java.util.HashMap;
import java.util.Map;



public class Main {

    public static void main(String[] args) throws Exception {

        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("diet", "vegetarian");
        dictionary.put("includeIngredients", "onions%2C+lettuce%2C+tomato");
        String site = getSite(dictionary);
        HttpResponse<JsonNode> recipe = getRecipe(site, "key");


        printRecipes(recipe);
    }

    public static String getSite(Map filter) {

        //"https://spoonacular-recipe-food-nutrition-v1.p.mashape.com/recipes/searchComplex?diet=vegan&includeIngredients=onions%2C+lettuce%2C+tomato&limitLicense=false&instructionsRequired=false&number=3&cuisine=american&intolerances=peanut%2C+shellfish&type=main+course&ranking=0&query=burger&addRecipeInformation=false&excludeIngredients=coconut%2C+mango&offset=0";
        //diet, includeIngredients, cuisine, intolerances, type, query, excludeIngredients

        String site = "https://spoonacular-recipe-food-nutrition-v1.p.mashape.com/recipes/searchComplex?";
        String limitLicense = "limitLicense=false&";
        String instructionsRequired = "instructionsRequired=false&";
        String number = "number=3&";
        String ranking = "ranking=0&";
        String addRecipeInformation = "addRecipeInformation=false&";
        String offset = "offset=0";

        if(filter.containsKey("diet")){
            site += "diet=" + filter.get("diet") + "&";
        }if(filter.containsKey("includeIngredients")){
            site += "includeIngredients=" + filter.get("includeIngredients") + "&";
        }

        site += limitLicense+instructionsRequired+number;

        if(filter.containsKey("cuisine")){
            site += "cuisine=" + filter.get("cuisine") + "&";
        }if(filter.containsKey("intolerances")){
            site += "intolerances=" + filter.get("intolerances") + "&";
        }if(filter.containsKey("type")){
            site += "type=" + filter.get("type") + "&";
        }

        site += ranking;

        if(filter.containsKey("query")){
            site += "query=" + filter.get("query") + "&";
        }
        site += addRecipeInformation;

        if(filter.containsKey("excludeIngredients")){
            site += "excludeIngredients=" + filter.get("excludeIngredients") + "&";
        }

        site += offset;

        return site;
    }

    public static HttpResponse<JsonNode> getRecipe(String site, String key) throws Exception{
        HttpResponse<JsonNode> response = Unirest.get(site)
                .header("X-Mashape-Key", key)
                .header("X-Mashape-Host", "spoonacular-recipe-food-nutrition-v1.p.mashape.com")
                .asJson();

        return response;
    }

    public static void printRecipes(HttpResponse<JsonNode> text){
        //String recipes = "[{\"image\":\"https://spoonacular.com/recipeImages/677-312x231.jpg\",\"missedIngredientCount\":2,\"id\":677,\"title\":\"Onion Tartlets\",\"imageType\":\"jpg\",\"usedIngredientCount\":1,\"likes\":0},{\"image\":\"https://spoonacular.com/recipeImages/980-312x231.jpg\",\"missedIngredientCount\":2,\"id\":980,\"title\":\"Domestic Diva's Sea Bass With Roasted Eggplant Puree & Olive An\",\"imageType\":\"jpg\",\"usedIngredientCount\":1,\"likes\":0},{\"image\":\"https://spoonacular.com/recipeImages/4511-312x231.jpg\",\"missedIngredientCount\":2,\"id\":4511,\"title\":\"Grilled Salmon in Tomato Water\",\"imageType\":\"jpg\",\"usedIngredientCount\":2,\"likes\":0}]}";

        String recipes = text.getBody().getObject().get("results").toString();
        String[] recipeList = recipes.substring(2, recipes.length()-3).split("},\\{");

        for(String item : recipeList) {
            System.out.println("Title: " + parceLine(item, "title"));
            System.out.println("Webaite: https://spoonacular.com/recipes/-" + parceLine(item, "id"));
            System.out.println();
        }
    }

    public static String parceLine(String s, String t){
        return s.split(t)[1].split(",")[0].replaceAll("\"", "").replaceAll(":","");
    }



}

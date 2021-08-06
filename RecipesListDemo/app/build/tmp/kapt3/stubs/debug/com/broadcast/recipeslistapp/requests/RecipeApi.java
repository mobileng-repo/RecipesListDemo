package com.broadcast.recipeslistapp.requests;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH\'\u00a8\u0006\f"}, d2 = {"Lcom/broadcast/recipeslistapp/requests/RecipeApi;", "", "getRecipe", "Lretrofit2/Call;", "Lcom/broadcast/recipeslistapp/requests/responses/RecipeResponse;", "recipe_id", "", "searchRecipe", "Lcom/broadcast/recipeslistapp/requests/responses/RecipeSearchResponse;", "query", "page", "", "app_debug"})
public abstract interface RecipeApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/search")
    public abstract retrofit2.Call<com.broadcast.recipeslistapp.requests.responses.RecipeSearchResponse> searchRecipe(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String query, @retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/get")
    public abstract retrofit2.Call<com.broadcast.recipeslistapp.requests.responses.RecipeResponse> getRecipe(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "rId")
    java.lang.String recipe_id);
}
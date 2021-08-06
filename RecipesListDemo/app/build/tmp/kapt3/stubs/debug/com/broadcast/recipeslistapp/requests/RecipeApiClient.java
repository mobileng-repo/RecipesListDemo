package com.broadcast.recipeslistapp.requests;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0013J\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000b0\u0013J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013J\u0016\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/broadcast/recipeslistapp/requests/RecipeApiClient;", "", "()V", "TAG", "", "isNetworkTimedOut", "Landroidx/lifecycle/MutableLiveData;", "", "mRecipe", "Lcom/broadcast/recipeslistapp/models/Recipe;", "mRecipes", "", "mRetrieveRecipeRunnable", "Lcom/broadcast/recipeslistapp/requests/RecipeApiClient$RetrieveRecipeRunnable;", "mRetrieveRecipesRunnable", "Lcom/broadcast/recipeslistapp/requests/RecipeApiClient$RetrieveRecipesRunnable;", "cancleRequest", "", "getRecipe", "Landroidx/lifecycle/LiveData;", "getRecipes", "searchRecipeApi", "query", "pageNumber", "", "searchRecipeById", "recipeId", "RetrieveRecipeRunnable", "RetrieveRecipesRunnable", "app_debug"})
public final class RecipeApiClient {
    private static final java.lang.String TAG = "RecipeApiClient";
    private static final androidx.lifecycle.MutableLiveData<java.util.List<com.broadcast.recipeslistapp.models.Recipe>> mRecipes = null;
    private static final androidx.lifecycle.MutableLiveData<com.broadcast.recipeslistapp.models.Recipe> mRecipe = null;
    private static final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isNetworkTimedOut = null;
    private static com.broadcast.recipeslistapp.requests.RecipeApiClient.RetrieveRecipesRunnable mRetrieveRecipesRunnable;
    private static com.broadcast.recipeslistapp.requests.RecipeApiClient.RetrieveRecipeRunnable mRetrieveRecipeRunnable;
    public static final com.broadcast.recipeslistapp.requests.RecipeApiClient INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.broadcast.recipeslistapp.models.Recipe>> getRecipes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.broadcast.recipeslistapp.models.Recipe> getRecipe() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isNetworkTimedOut() {
        return null;
    }
    
    public final void searchRecipeApi(@org.jetbrains.annotations.NotNull()
    java.lang.String query, int pageNumber) {
    }
    
    public final void searchRecipeById(@org.jetbrains.annotations.NotNull()
    java.lang.String recipeId) {
    }
    
    public final void cancleRequest() {
    }
    
    private RecipeApiClient() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/broadcast/recipeslistapp/requests/RecipeApiClient$RetrieveRecipesRunnable;", "Ljava/lang/Runnable;", "query", "", "pageNumber", "", "(Ljava/lang/String;I)V", "cancelRequest", "", "getCancelRequest", "()Z", "setCancelRequest", "(Z)V", "getRecipes", "Lretrofit2/Call;", "Lcom/broadcast/recipeslistapp/requests/responses/RecipeSearchResponse;", "run", "", "app_debug"})
    public static final class RetrieveRecipesRunnable implements java.lang.Runnable {
        private java.lang.String query;
        private int pageNumber;
        private boolean cancelRequest;
        
        public final boolean getCancelRequest() {
            return false;
        }
        
        public final void setCancelRequest(boolean p0) {
        }
        
        @java.lang.Override()
        public void run() {
        }
        
        private final retrofit2.Call<com.broadcast.recipeslistapp.requests.responses.RecipeSearchResponse> getRecipes(java.lang.String query, int pageNumber) {
            return null;
        }
        
        public RetrieveRecipesRunnable(@org.jetbrains.annotations.NotNull()
        java.lang.String query, int pageNumber) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/broadcast/recipeslistapp/requests/RecipeApiClient$RetrieveRecipeRunnable;", "Ljava/lang/Runnable;", "recipeId", "", "(Ljava/lang/String;)V", "cancelRequest", "", "getCancelRequest", "()Z", "setCancelRequest", "(Z)V", "getRecipe", "Lretrofit2/Call;", "Lcom/broadcast/recipeslistapp/requests/responses/RecipeResponse;", "run", "", "app_debug"})
    public static final class RetrieveRecipeRunnable implements java.lang.Runnable {
        private java.lang.String recipeId;
        private boolean cancelRequest;
        
        public final boolean getCancelRequest() {
            return false;
        }
        
        public final void setCancelRequest(boolean p0) {
        }
        
        @java.lang.Override()
        public void run() {
        }
        
        private final retrofit2.Call<com.broadcast.recipeslistapp.requests.responses.RecipeResponse> getRecipe(java.lang.String recipeId) {
            return null;
        }
        
        public RetrieveRecipeRunnable(@org.jetbrains.annotations.NotNull()
        java.lang.String recipeId) {
            super();
        }
    }
}
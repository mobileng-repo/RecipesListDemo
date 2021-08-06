package com.broadcast.recipeslistapp.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0002J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0013J\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0013J\b\u0010\u0015\u001a\u00020\u000fH\u0002J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013J\u0006\u0010\u0018\u001a\u00020\u000fJ\u0016\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\rR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/broadcast/recipeslistapp/repositories/RecipeRepository;", "", "()V", "mIsQueryExhausted", "Landroidx/lifecycle/MutableLiveData;", "", "mRecipes", "Landroidx/lifecycle/MediatorLiveData;", "", "Lcom/broadcast/recipeslistapp/models/Recipe;", "pageNumber", "", "query", "", "cancleRequest", "", "doneQuery", "recipeList", "getRecipe", "Landroidx/lifecycle/LiveData;", "getRecipes", "initMediators", "isNetworkTimedOut", "isQueryExhausted", "searchNextPage", "searchRecipeApi", "searchRecipeById", "recipeId", "app_debug"})
public final class RecipeRepository {
    private static int pageNumber;
    private static java.lang.String query;
    private static final androidx.lifecycle.MediatorLiveData<java.util.List<com.broadcast.recipeslistapp.models.Recipe>> mRecipes = null;
    private static final androidx.lifecycle.MutableLiveData<java.lang.Boolean> mIsQueryExhausted = null;
    public static final com.broadcast.recipeslistapp.repositories.RecipeRepository INSTANCE = null;
    
    private final void initMediators() {
    }
    
    private final void doneQuery(java.util.List<com.broadcast.recipeslistapp.models.Recipe> recipeList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isQueryExhausted() {
        return null;
    }
    
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
    
    public final void searchRecipeById(@org.jetbrains.annotations.NotNull()
    java.lang.String recipeId) {
    }
    
    public final void searchRecipeApi(@org.jetbrains.annotations.NotNull()
    java.lang.String query, int pageNumber) {
    }
    
    public final void cancleRequest() {
    }
    
    public final void searchNextPage() {
    }
    
    private RecipeRepository() {
        super();
    }
}
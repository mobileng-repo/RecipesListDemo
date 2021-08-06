package com.broadcast.recipeslistapp.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007J\u0006\u0010\u0003\u001a\u00020\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/broadcast/recipeslistapp/viewmodels/RecipeListViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "isPerformingQuery", "", "mIsViewingRecipes", "getRecipes", "Landroidx/lifecycle/LiveData;", "", "Lcom/broadcast/recipeslistapp/models/Recipe;", "isQueryExhausted", "isViewingRecipes", "onBackPressed", "searchNextPage", "", "searchRecipeApi", "query", "", "pageNumber", "", "setPerformingQuery", "setViewingRecipe", "isViewingRecipe", "app_debug"})
public final class RecipeListViewModel extends androidx.lifecycle.ViewModel {
    private boolean mIsViewingRecipes;
    private boolean isPerformingQuery;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.broadcast.recipeslistapp.models.Recipe>> getRecipes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isQueryExhausted() {
        return null;
    }
    
    public final void searchRecipeApi(@org.jetbrains.annotations.NotNull()
    java.lang.String query, int pageNumber) {
    }
    
    public final boolean isPerformingQuery() {
        return false;
    }
    
    public final void searchNextPage() {
    }
    
    public final void setPerformingQuery(boolean isPerformingQuery) {
    }
    
    public final boolean isViewingRecipes() {
        return false;
    }
    
    public final void setViewingRecipe(boolean isViewingRecipe) {
    }
    
    public final boolean onBackPressed() {
        return false;
    }
    
    public RecipeListViewModel() {
        super();
    }
}
package com.broadcast.recipeslistapp.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/broadcast/recipeslistapp/viewmodels/RecipeViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "mDidRetrieveRecipe", "", "didRetrieveRecipe", "getRecipe", "Landroidx/lifecycle/LiveData;", "Lcom/broadcast/recipeslistapp/models/Recipe;", "isNetworkTimedOut", "searchRecipeById", "", "recipeId", "", "setRetrievedRecipe", "retrievedRecipe", "app_debug"})
public final class RecipeViewModel extends androidx.lifecycle.ViewModel {
    private boolean mDidRetrieveRecipe;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.broadcast.recipeslistapp.models.Recipe> getRecipe() {
        return null;
    }
    
    public final void searchRecipeById(@org.jetbrains.annotations.NotNull()
    java.lang.String recipeId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isNetworkTimedOut() {
        return null;
    }
    
    public final void setRetrievedRecipe(boolean retrievedRecipe) {
    }
    
    public final boolean didRetrieveRecipe() {
        return false;
    }
    
    public RecipeViewModel() {
        super();
    }
}
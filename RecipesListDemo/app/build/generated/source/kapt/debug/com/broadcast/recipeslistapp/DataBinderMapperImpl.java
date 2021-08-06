package com.broadcast.recipeslistapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.broadcast.recipeslistapp.databinding.LayoutCategoryListItemBindingImpl;
import com.broadcast.recipeslistapp.databinding.LayoutRecipeListItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_LAYOUTCATEGORYLISTITEM = 1;

  private static final int LAYOUT_LAYOUTRECIPELISTITEM = 2;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(2);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.broadcast.recipeslistapp.R.layout.layout_category_list_item, LAYOUT_LAYOUTCATEGORYLISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.broadcast.recipeslistapp.R.layout.layout_recipe_list_item, LAYOUT_LAYOUTRECIPELISTITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_LAYOUTCATEGORYLISTITEM: {
          if ("layout/layout_category_list_item_0".equals(tag)) {
            return new LayoutCategoryListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_category_list_item is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTRECIPELISTITEM: {
          if ("layout/layout_recipe_list_item_0".equals(tag)) {
            return new LayoutRecipeListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_recipe_list_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "social_rank");
      sKeys.put(2, "recipe");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(2);

    static {
      sKeys.put("layout/layout_category_list_item_0", com.broadcast.recipeslistapp.R.layout.layout_category_list_item);
      sKeys.put("layout/layout_recipe_list_item_0", com.broadcast.recipeslistapp.R.layout.layout_recipe_list_item);
    }
  }
}

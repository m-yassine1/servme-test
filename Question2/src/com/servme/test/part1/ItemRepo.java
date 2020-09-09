package com.servme.test.part1;

import java.util.HashSet;
import java.util.Set;
/*
 * To answer question 2, the item will be inserted as a new item because methods hashCode and equals are not overridden.
 * The problem can be fixed by overriding the methods stated previously.
 * To answer question 3, set is not the best collection option to use for this case. It would be best if we used a map
 * since we only one unique identifier which we can use as the map's key.
 *
 */
public class ItemRepo {
    private Set<Item> items = new HashSet<>();

    public void putItem(Item item){
        items.add(item);
    }

    public void removeItemById(int itemId){
        // TODO
        items.removeIf(i -> i.getId() == itemId);
    }

    public Item getItemById(int itemId){
        // TODO
        return items.stream().filter(i -> itemId == i.getId()).findFirst().orElse(null);
    }
}

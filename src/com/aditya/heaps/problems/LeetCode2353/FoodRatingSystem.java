package com.aditya.heaps.problems.LeetCode2353;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class FoodRatingSystem {
    Map<String, Queue<Pair>> cusinesQueue;
    Map<String,String> foodToCusines;
    Map<String,Integer> foodRating;
    public void FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        cusinesQueue=new HashMap<>();
        foodRating=new HashMap<>();
        foodToCusines=new HashMap<>();
        for(int i=0;i<foods.length;i++)
        {
            if(cusinesQueue.get(cuisines[i])==null)
                cusinesQueue.put(cuisines[i],new PriorityQueue<Pair>((a, b)->
                {
                    int result=b.rating-a.rating;
                    if(result==0) return a.food.compareTo(b.food);
                    else
                        return result;
                }));

            cusinesQueue.get(cuisines[i]).offer(new Pair(foods[i],ratings[i]));
            foodToCusines.put(foods[i],cuisines[i]);
            foodRating.put(foods[i],ratings[i]);
        }
    }

    public void changeRating(String food, int newRating) {
        String cuisine=foodToCusines.get(food);
        foodRating.put(food,newRating);
        cusinesQueue.get(cuisine).offer(new Pair(food,newRating));
    }

    public String highestRated(String cuisine) {
        Pair pulledOut=cusinesQueue.get(cuisine).peek();
        while(pulledOut.rating!=foodRating.get(pulledOut.food))
        {
            cusinesQueue.get(cuisine).poll();
            pulledOut=cusinesQueue.get(cuisine).peek();
        }
        return pulledOut.food;

    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */
class Pair
{
    String food;
    int rating;
    public Pair(String food,int rating)
    {
        this.food=food;
        this.rating=rating;
    }
}


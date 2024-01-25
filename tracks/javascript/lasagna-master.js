export function cookingStatus(remainingTime) {
    if (remainingTime == 0) {
        return 'Lasagna is done.';
    } else if (remainingTime > 0) {
        return 'Not done, please wait.';
    } else {
        return 'You forgot to set the timer.';
    }
}

export function preparationTime(layers, timePerLayer) {
    if (timePerLayer) {
        return layers.length * timePerLayer
    } else {
        return layers.length * 2;
    }
}

export function quantities(ingredients) {
    return {
        noodles: ingredients.filter(i => i === 'noodles').length * 50,
        sauce: ingredients.filter(i => i === 'sauce').length * 0.2,
    }
}

export function addSecretIngredient(friendsList, myList) {
    myList.push(friendsList[friendsList.length - 1]);
}

export function scaleRecipe(recipe, portionCount) {
    let newRecipe = {};
    for (const ingredient in recipe) {
        newRecipe[ingredient] = (recipe[ingredient] / 2) * portionCount;
    }
    return newRecipe;
}
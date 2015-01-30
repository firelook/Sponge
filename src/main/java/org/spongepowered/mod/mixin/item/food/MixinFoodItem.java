/*
 * This file is part of Sponge, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered.org <http://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.mod.mixin.item.food;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.api.item.food.FoodItem;
import org.spongepowered.api.util.annotation.NonnullByDefault;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@NonnullByDefault
@Mixin(net.minecraft.item.ItemFood.class)
public abstract class MixinFoodItem extends ItemFood implements FoodItem {

    public MixinFoodItem(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
        super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
    }

    public MixinFoodItem(int p_i45340_1_, boolean p_i45340_2_) {
        super(p_i45340_1_, p_i45340_2_);
    }

    @Shadow(prefix = "shadow$")
    public abstract ItemStack shadow$onItemUseFinish(ItemStack stack, World worldIn, EntityPlayer playerIn);//
//  {
//      return super.onItemUseFinish(stack, worldIn, playerIn);
//  }

    @Shadow(prefix = "shadow$")
    protected abstract void shadow$onFoodEaten(ItemStack p_77849_1_, World worldIn, EntityPlayer p_77849_3_);
//    {
//        super.onFoodEaten(p_77849_1_, worldIn, p_77849_3_);
//    }

    @Shadow(prefix = "shadow$")
    public abstract int shadow$getMaxItemUseDuration(ItemStack stack) ;
//    {
//        return super.getMaxItemUseDuration(stack);
//    }

    @Shadow(prefix = "shadow$")
    public abstract EnumAction shadow$getItemUseAction(ItemStack stack) ;
//    {
//        return super.getItemUseAction(stack);
//    }

    @Shadow(prefix = "shadow$")
    public abstract ItemStack shadow$onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn);
//    {
//        return super.onItemRightClick(itemStackIn, worldIn, playerIn);
//    }

    @Shadow(prefix = "shadow$")
    public abstract int shadow$getHealAmount(ItemStack itemStackIn);
//    {
//        return super.getHealAmount(itemStackIn);
//    }

    @Shadow(prefix = "shadow$")
    public abstract float shadow$getSaturationModifier(ItemStack itemStackIn);
//    {
//        return super.getSaturationModifier(itemStackIn);
//    }

    @Shadow(prefix = "shadow$")
    public abstract boolean shadow$isWolfsFavoriteMeat();
//    {
//        return super.isWolfsFavoriteMeat();
//    }

  //  @Shadow(prefix = "shadow$")
 //   public abstract ItemFood shadow$setPotionEffect(int p_77844_1_, int duration, int amplifier, float probability);
//    {
//        return super.setPotionEffect(p_77844_1_, duration, amplifier, probability);
//    }

//    @Shadow(prefix = "shadow$")
//    public abstract ItemFood shadow$setAlwaysEdible();
//    {
//        return super.setAlwaysEdible();
//    }

}


package com.fasterxml.jackson.annotation;

class JsonAutoDetect$1 {
   static final int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility;
   static final int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor = new int[PropertyAccessor.values().length];

   static {
      try {
         $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.CREATOR.ordinal()] = 1;
      } catch (NoSuchFieldError var12) {
      }

      try {
         $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.FIELD.ordinal()] = 2;
      } catch (NoSuchFieldError var11) {
      }

      try {
         $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.GETTER.ordinal()] = 3;
      } catch (NoSuchFieldError var10) {
      }

      try {
         $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.IS_GETTER.ordinal()] = 4;
      } catch (NoSuchFieldError var9) {
      }

      try {
         $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.NONE.ordinal()] = 5;
      } catch (NoSuchFieldError var8) {
      }

      try {
         $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.SETTER.ordinal()] = 6;
      } catch (NoSuchFieldError var7) {
      }

      try {
         $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.ALL.ordinal()] = 7;
      } catch (NoSuchFieldError var6) {
      }

      $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility = new int[JsonAutoDetect$Visibility.values().length];

      try {
         $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[JsonAutoDetect$Visibility.ANY.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[JsonAutoDetect$Visibility.NONE.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[JsonAutoDetect$Visibility.NON_PRIVATE.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }

      try {
         $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[JsonAutoDetect$Visibility.PROTECTED_AND_PUBLIC.ordinal()] = 4;
      } catch (NoSuchFieldError var2) {
      }

      try {
         $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[JsonAutoDetect$Visibility.PUBLIC_ONLY.ordinal()] = 5;
      } catch (NoSuchFieldError var1) {
      }

   }
}

package kotlin.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;

@Metadata(
   mv = {1, 1, 15},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0081\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"},
   d2 = {"Lkotlin/internal/RequireKotlinVersionKind;", "", "(Ljava/lang/String;I)V", "LANGUAGE_VERSION", "COMPILER_VERSION", "API_VERSION", "kotlin-stdlib"}
)
@SinceKotlin(
   version = "1.2"
)
public final class RequireKotlinVersionKind extends Enum {
   public static final RequireKotlinVersionKind LANGUAGE_VERSION;
   public static final RequireKotlinVersionKind COMPILER_VERSION;
   public static final RequireKotlinVersionKind API_VERSION;
   private static final RequireKotlinVersionKind[] $VALUES = new RequireKotlinVersionKind[]{LANGUAGE_VERSION = new RequireKotlinVersionKind("LANGUAGE_VERSION", 0), COMPILER_VERSION = new RequireKotlinVersionKind("COMPILER_VERSION", 1), API_VERSION = new RequireKotlinVersionKind("API_VERSION", 2)};

   private RequireKotlinVersionKind(String var1, int var2) {
      super(var1, var2);
   }

   public static RequireKotlinVersionKind[] values() {
      return (RequireKotlinVersionKind[])$VALUES.clone();
   }

   public static RequireKotlinVersionKind valueOf(String var0) {
      return (RequireKotlinVersionKind)Enum.valueOf(RequireKotlinVersionKind.class, var0);
   }
}

package kotlin;

@Metadata(
   mv = {1, 1, 15},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"},
   d2 = {"Lkotlin/LazyThreadSafetyMode;", "", "(Ljava/lang/String;I)V", "SYNCHRONIZED", "PUBLICATION", "NONE", "kotlin-stdlib"}
)
public final class LazyThreadSafetyMode extends Enum {
   public static final LazyThreadSafetyMode SYNCHRONIZED;
   public static final LazyThreadSafetyMode PUBLICATION;
   public static final LazyThreadSafetyMode NONE;
   private static final LazyThreadSafetyMode[] $VALUES = new LazyThreadSafetyMode[]{SYNCHRONIZED = new LazyThreadSafetyMode("SYNCHRONIZED", 0), PUBLICATION = new LazyThreadSafetyMode("PUBLICATION", 1), NONE = new LazyThreadSafetyMode("NONE", 2)};

   private LazyThreadSafetyMode(String var1, int var2) {
      super(var1, var2);
   }

   public static LazyThreadSafetyMode[] values() {
      return (LazyThreadSafetyMode[])$VALUES.clone();
   }

   public static LazyThreadSafetyMode valueOf(String var0) {
      return (LazyThreadSafetyMode)Enum.valueOf(LazyThreadSafetyMode.class, var0);
   }
}

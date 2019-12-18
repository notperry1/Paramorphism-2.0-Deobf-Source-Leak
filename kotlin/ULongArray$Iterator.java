package kotlin;

import java.util.NoSuchElementException;
import kotlin.collections.ULongIterator;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 15},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\bH\u0096\u0002J\u0010\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"},
   d2 = {"Lkotlin/ULongArray$Iterator;", "Lkotlin/collections/ULongIterator;", "array", "", "([J)V", "index", "", "hasNext", "", "nextULong", "Lkotlin/ULong;", "()J", "kotlin-stdlib"}
)
final class ULongArray$Iterator extends ULongIterator {
   private int index;
   private final long[] array;

   public boolean hasNext() {
      return this.index < this.array.length;
   }

   public long nextULong() {
      if (this.index < this.array.length) {
         long[] var10000 = this.array;
         int var1;
         this.index = (var1 = this.index) + 1;
         long var4 = var10000[var1];
         boolean var3 = false;
         return ULong.constructor-impl(var4);
      } else {
         throw (Throwable)(new NoSuchElementException(String.valueOf(this.index)));
      }
   }

   public ULongArray$Iterator(@NotNull long[] var1) {
      super();
      this.array = var1;
   }
}

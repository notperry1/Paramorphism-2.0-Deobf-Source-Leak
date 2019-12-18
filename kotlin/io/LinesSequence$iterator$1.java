package kotlin.io;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 15},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\u0017\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0006\u001a\u00020\u0004H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0096\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"},
   d2 = {"kotlin/io/LinesSequence$iterator$1", "", "", "done", "", "nextValue", "hasNext", "next", "kotlin-stdlib"}
)
public final class LinesSequence$iterator$1 implements Iterator, KMappedMarker {
   private String nextValue;
   private boolean done;
   final LinesSequence this$0;

   public boolean hasNext() {
      if (this.nextValue == null && !this.done) {
         this.nextValue = LinesSequence.access$getReader$p(this.this$0).readLine();
         if (this.nextValue == null) {
            this.done = true;
         }
      }

      return this.nextValue != null;
   }

   @NotNull
   public String next() {
      if (!this.hasNext()) {
         throw (Throwable)(new NoSuchElementException());
      } else {
         String var1 = this.nextValue;
         this.nextValue = (String)null;
         if (var1 == null) {
            Intrinsics.throwNpe();
         }

         return var1;
      }
   }

   public Object next() {
      return this.next();
   }

   LinesSequence$iterator$1(LinesSequence var1) {
      super();
      this.this$0 = var1;
   }

   public void remove() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }
}

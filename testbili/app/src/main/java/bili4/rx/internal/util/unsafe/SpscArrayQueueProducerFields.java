package bili4.rx.internal.util.unsafe;

/* compiled from: BL */
abstract class SpscArrayQueueProducerFields<E> extends SpscArrayQueueL1Pad<E> {
    protected static final long P_INDEX_OFFSET = UnsafeAccess.addressOf(SpscArrayQueueProducerFields.class, "producerIndex");
    protected long producerIndex;

    public SpscArrayQueueProducerFields(int i) {
        super(i);
    }
}

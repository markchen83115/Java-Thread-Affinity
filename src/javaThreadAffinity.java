import net.openhft.affinity.AffinityLock;
class javaThreadAffinity {
    public static void main(String[] args) {
        try (AffinityLock affinityLock = AffinityLock.acquireLock(2))   {
            // do some work while locked to a CPU. 
            while(true) {} 
        } 
    }
}


public class Pair<KEY, VALUE> {
    private KEY key;
    private VALUE val;

    public Pair(KEY key, VALUE val) {
        this.key = key;
        this.val = val;
    }

    public KEY getKey() {
        return key;
    }

    public void setKey(KEY key) {
        this.key = key;
    }

    public VALUE getVal() {
        return val;
    }

    public void setVal(VALUE val) {
        this.val = val;
    }
}

interface Rules<T> {
    void rule1(T data);
    T rule2();
}

class MyPlace implements Rules<String>{

    @Override
    public void rule1(String data) {

    }

    @Override
    public String rule2() {
        return null;
    }
}


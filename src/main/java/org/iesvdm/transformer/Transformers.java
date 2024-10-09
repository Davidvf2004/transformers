package org.iesvdm.transformer;

import java.util.ArrayList;

public class Transformers {
    public static <T> ArrayList<T> applyConst(Transformer<T> tran, ArrayList<T> a) {
        ArrayList<T> b = new ArrayList<>();
        for (T t : a) {
            b.add(tran.transform(t));
        }
        return b;
    }

    public static <T> void applyDest(Transformer<T> transformer, ArrayList<T> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, transformer.transform(list.get(i)));
        }
    }
    }


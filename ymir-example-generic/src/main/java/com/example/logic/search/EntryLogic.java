package com.example.logic.search;

import java.util.ArrayList;
import java.util.List;

import com.example.dao.search.Entry;
import com.example.search.EntryAlreadyDeletedRuntimeException;

public class EntryLogic {
    private Entry[] entries;

    public EntryLogic() {
        entries = new Entry[] { new Entry(1, "ぶどう"), new Entry(2, "りんご"),
                new Entry(3, "すいか"), new Entry(4, "もも"), new Entry(5, "なし"), };
    }

    public List<Entry> search(String name) {
        List<Entry> list = new ArrayList<Entry>();
        for (Entry entry : entries) {
            if (entry.getName().indexOf(name) >= 0) {
                list.add((Entry) entry.clone());
            }
        }
        return list;
    }

    public Entry get(Integer id) {
        for (Entry entry : entries) {
            if (entry.getId().equals(id)) {
                return (Entry) entry.clone();
            }
        }
        throw new EntryAlreadyDeletedRuntimeException();
    }
}

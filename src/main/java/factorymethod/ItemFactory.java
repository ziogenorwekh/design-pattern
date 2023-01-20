package factorymethod;

import java.util.HashMap;

// 인터페이스 부분을 구현한다.
public class ItemFactory extends Factory {
    @Override
    public boolean isCreatable(String name) {
        ItemData itemData = repository.get(name);

        if (itemData == null) {
            System.out.println(name + "은 알 수 없는 아이템입니다.");
            return false;
        }

        if (itemData.currentCount >= itemData.maxCount) {
            System.out.println(name + "은 품절 아이템입니다.");
            return false;
        }

        return true;
    }

    @Override
    public Item createItem(String name) {
        Item item = null;
        if (name.equals("sword")) {
            item = new Sword();
        }
        if (name.equals("shield")) {
            item = new Shield();
        }
        if (name.equals("bow")) {
            item = new Bow();
        }

        return item;
    }

    @Override
    public void postprocessItem(String name) {
        ItemData itemData = repository.get(name);
        if (itemData != null)
            itemData.currentCount++;
    }

    // 각 아이템에 대한 최대 생성 개수와 현재 생성된 아이템의 개수를 저장
    private class ItemData {
        int maxCount;
        int currentCount;

        ItemData(int maxCount) {
            this.maxCount = maxCount;
        }
    }

    private final HashMap<String, ItemData> repository;

    public ItemFactory() {
        repository = new HashMap<>();
        repository.put("sword", new ItemData(3));
        repository.put("shield", new ItemData(2));
        repository.put("bow", new ItemData(1));
    }
}

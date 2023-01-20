package composite;


import java.util.Iterator;
import java.util.LinkedList;

// 상자에 해당
public class Folder extends Unit {

    // 자신이 포함될 유닛 객체를 담을 유닛 리스트
    private LinkedList<Unit> unitLinkedList = new LinkedList<>();

    public Folder(String name) {
        super(name);
    }

    // 자신이 포함하고 있는 파일 및 폴더의 용량을 모두 합해서 반환한다.
    @Override
    public int getSize() {
        int size = 0;
        Iterator<Unit> it = unitLinkedList.iterator();

        while (it.hasNext()) {
            Unit unit = it.next();
            size += unit.getSize();
        }
        return size;
    }

    public boolean add(Unit unit) {
        unitLinkedList.add(unit);
        return true;
    }

    // 재귀 구문
    // 유닛체와 집합체를 동일한 개념으로 처리하다 보니, 재귀 구문이 많다.
    private void list(String indent, Unit unit) {
        if (unit instanceof File) {
            System.out.println(indent + unit);
        } else {
            Folder dir = (Folder) unit;
            Iterator<Unit> it = dir.unitLinkedList.iterator();
            System.out.println(indent + "+ " + unit);
            while (it.hasNext()) {
                list(indent + "    ", it.next());
            }
        }
    }

    public void list() {
        list("",this);
    }
}

package HeadFirstDesignPatterns.IteratorPattern;

import java.awt.*;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.IteratorPattern
 * @ClassName: DinerMenuIterator
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-27 上午10:43
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-27 上午10:43
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null)
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }
}

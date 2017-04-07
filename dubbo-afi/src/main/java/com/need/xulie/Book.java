package com.need.xulie;

import java.io.Serializable;

/**
 * <p>TODO</p>
 * <p/>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author afi on on 2016/11/25.
 * @version 1.0
 * @since 1.0
 */
public class Book implements Serializable {
    private int isbn;

    public Book(int isbn) {
        super();
        this.isbn = isbn;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book [isbn=" + isbn + "]";
    }


}
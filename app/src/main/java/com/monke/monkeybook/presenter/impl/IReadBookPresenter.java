//Copyright (c) 2017. 章钦豪. All rights reserved.
package com.monke.monkeybook.presenter.impl;

import android.app.Activity;

import com.monke.basemvplib.impl.IPresenter;
import com.monke.monkeybook.bean.BookShelfBean;
import com.monke.monkeybook.bean.BookmarkBean;
import com.monke.monkeybook.bean.SearchBookBean;
import com.monke.monkeybook.presenter.ReadBookPresenterImpl;

public interface IReadBookPresenter extends IPresenter {

    int getOpen_from();

    BookShelfBean getBookShelf();

    void loadContent(final int chapterIndex);

    void saveProgress();

    String getChapterTitle(int chapterIndex);

    void addToShelf(final ReadBookPresenterImpl.OnAddListener addListner);

    void removeFromShelf();

    void initData(Activity activity);

    void openBookFromOther(Activity activity);

    void addDownload(int start, int end);

    void changeBookSource(SearchBookBean searchBookBean);

    void saveBookmark(BookmarkBean bookmarkBean);

    void delBookmark(BookmarkBean bookmarkBean);
}

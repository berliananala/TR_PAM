package com.blueocean.tr_pam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.tr.adapter.RecomendAdapter;
import com.example.tr.model.Recomend;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    RecyclerView recomendView;

    RecomendAdapter recomendAdapter;
    List<Recomend> recomendList;

    LinearLayout btnSubView, btnSubDigitalArt, btnSubPhotograph, btnSubSketch;
    TextView username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        username = findViewById(R.id.username);
        btnSubView = findViewById(R.id.btn_sub_view);
        btnSubDigitalArt = findViewById(R.id.btn_sub_digitalArt);
        btnSubPhotograph = findViewById(R.id.btn_sub_photograph);
        btnSubSketch = findViewById(R.id.btn_sub_sketch);

        recomendView = findViewById(R.id.recomend_layout);

        recomendList = new ArrayList<>();
        recomendList.add(new Recomend("D1", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.d1, R.drawable.d1));
        recomendList.add(new Recomend("D2", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.d2, R.drawable.d2));
        recomendList.add(new Recomend("D3", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.d3, R.drawable.d3));
        recomendList.add(new Recomend("D4", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.d4, R.drawable.d4));
        recomendList.add(new Recomend("D5", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.d5, R.drawable.d5));
        recomendList.add(new Recomend("D6", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.d6, R.drawable.d6));
        recomendList.add(new Recomend("D7", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.d7, R.drawable.d7));
        recomendList.add(new Recomend("D8", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.d8, R.drawable.d8));
        recomendList.add(new Recomend("D9", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.d9, R.drawable.d9));
        recomendList.add(new Recomend("D10", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.d10, R.drawable.d10));
        recomendList.add(new Recomend("D11", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.d11, R.drawable.d11));
        recomendList.add(new Recomend("D12", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.d12, R.drawable.d12));
        recomendList.add(new Recomend("D13", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.d13, R.drawable.d13));

        recomendList.add(new Recomend("P1", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.p1, R.drawable.p1));
        recomendList.add(new Recomend("P2", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.p2, R.drawable.p2));
        recomendList.add(new Recomend("P3", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.p3, R.drawable.p3));
        recomendList.add(new Recomend("P4", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.p4, R.drawable.p4));
        recomendList.add(new Recomend("P5", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.p5, R.drawable.p5));

        recomendList.add(new Recomend("V1", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.v1, R.drawable.v1));
        recomendList.add(new Recomend("V2", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.v2, R.drawable.v2));
        recomendList.add(new Recomend("V3", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.v3, R.drawable.v3));
        recomendList.add(new Recomend("V4", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.v4, R.drawable.v4));
        recomendList.add(new Recomend("V5", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.v5, R.drawable.v5));
        recomendList.add(new Recomend("V6", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.v6, R.drawable.v6));
        recomendList.add(new Recomend("V7", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.v7, R.drawable.v7));
        recomendList.add(new Recomend("V8", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.v8, R.drawable.v8));
        recomendList.add(new Recomend("V9", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.v9, R.drawable.v9));
        recomendList.add(new Recomend("V10", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.v10, R.drawable.v10));
        recomendList.add(new Recomend("V11", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.v11, R.drawable.v11));
        recomendList.add(new Recomend("V12", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.v12, R.drawable.v12));
        recomendList.add(new Recomend("V13", "Pada karya ini mengungkapkan bahwa surealisme dan keindahan klasik adalah elemen konstan dalam " +
                "potret digital yang dihiasi dengan palet warna warni.", "$ 5.00", "1", "BH", R.drawable.v13, R.drawable.v13));

        setRecomendRecycle(recomendList);
    }

    public void setBtnSubView(View v) {
        Intent gotogalery1 = new Intent(HomeActivity.this, galery.class);
        startActivity(gotogalery1);
    }

    public void setBtnSubDigitalArt(View v){
        Intent gotogalery2 = new Intent(HomeActivity.this, galery.class);
        startActivity(gotogalery2);
    }

    public void setBtnSubPhotograph(View v) {
        Intent gotogalery3 = new Intent(HomeActivity.this, galery.class);
        startActivity(gotogalery3);
    }

    public void setBtnSubSketch(View v) {
        Intent gotogalery3 = new Intent(HomeActivity.this, galery.class);
        startActivity(gotogalery3);
    }

    public void setRecomendRecycle(List<Recomend> recomendDataList){
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,3);
        recomendView.setLayoutManager(layoutManager);
        recomendView.addItemDecoration(new GridSpacingItemDecoration(3, 7,true));
        recomendAdapter = new RecomendAdapter(this,recomendDataList);
        recomendView.setAdapter(recomendAdapter);
    }

    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {
        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view);
            int column = position % spanCount;

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; 
                outRect.right = (column + 1) * spacing / spanCount;

                if (position < spanCount) {
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; 
            } else {
                outRect.left = column * spacing / spanCount; 
                outRect.right = spacing - (column + 1) * spacing / spanCount; 
                if (position >= spanCount) {
                    outRect.top = spacing;
                }
            }
        }
    }
}

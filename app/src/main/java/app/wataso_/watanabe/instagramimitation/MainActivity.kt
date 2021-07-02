package app.wataso_.watanabe.instagramimitation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.Menu
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var dataLists: ArrayList<DataList>

        //recyclerviewの実装
        val recyclerView = findViewById<View>(R.id.recyclerView) as RecyclerView
        dataLists = DataList.createUsersList(20)
        val adapter = ListAdapter(dataLists)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        //actionBar().setTitle(Html.fromHtml("<font color=\"black\"> + getString(R.string.app_name) +</font>");
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }
}
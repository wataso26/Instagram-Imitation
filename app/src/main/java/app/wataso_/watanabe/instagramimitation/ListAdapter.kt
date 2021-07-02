package app.wataso_.watanabe.instagramimitation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter (private val mDataLists: List<DataList>) : RecyclerView.Adapter<ListAdapter.ViewHolder>()
{

    inner class ViewHolder(listItemView: View) : RecyclerView.ViewHolder(listItemView) {
        val username = itemView.findViewById<TextView>(R.id.user_name)
        //val userImage = itemView.findViewById<ImageView>(R.id.icon)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val itemListView = inflater.inflate(R.layout.item_list, parent, false)
        return ViewHolder(itemListView)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val dataList: DataList = mDataLists.get(position)
        val textView = viewHolder.username
        textView?.setText(dataList.name)
    }

    // Returns the total count of items in the list
    override fun getItemCount(): Int {
        return mDataLists.size
    }

}
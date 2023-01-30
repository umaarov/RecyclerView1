package uz.umarov.homework13_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import uz.umarov.homework13_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        binding.rv.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = RvAdapter(createMovieList())
        }
    }

    private fun createMovieList(): ArrayList<MoviesData> {
        return arrayListOf<MoviesData>(
            MoviesData(
                R.drawable.avengers,
                "Avengers",
                "Views: 500",
                "Release Date: 16 Feb 2018"
            ),
            MoviesData(
                R.drawable.avengers2,
                "Avengers: Age of Ultron",
                "Views: 400",
                "Release Date: 17 March 2018"
            ),
            MoviesData(
                R.drawable.img,
                "Iron Man 3",
                "Views: 550",
                "Release Date: 17 April 2018"
            ),
            MoviesData(
                R.drawable.img_1,
                "Avengers: Infinity War",
                "Views: 1500",
                "Release Date: 15 Jan 2018"
            ),
        )
    }
}
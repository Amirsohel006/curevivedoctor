package com.curevivedoctor.app.modules.loginwithselection

import android.content.Intent
import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import com.curevivedoctor.app.R
import com.curevivedoctor.app.modules.LoginScreenForReki
import com.curevivedoctor.app.modules.homecontainer.HomeContainerActivity
import com.curevivedoctor.app.modules.loginforyoga.LoginForYoga
import com.curevivedoctor.app.modules.loginscreen.ui.LoginScreenActivity
import com.curevivedoctor.app.modules.rekihomecontainer.RekiHomeContainer

class LoginWithSelection : AppCompatActivity() {

    private var selectedCardId: Int = -1
    private lateinit var doctorCard: CardView
    private lateinit var yogaTrainerCard: CardView
    private lateinit var rekiMasterCard: CardView
    private lateinit var supervisorCard:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_with_selection)

        doctorCard = findViewById<CardView>(R.id.linearColumndoctor)
        yogaTrainerCard = findViewById<CardView>(R.id.linearColumnyogatrain)
        rekiMasterCard = findViewById<CardView>(R.id.linearColumnrekimaste)
        supervisorCard = findViewById<CardView>(R.id.linearColumndocto1r)

        supervisorCard.setOnClickListener{selectCard(supervisorCard)}
        doctorCard.setOnClickListener { selectCard(doctorCard) }
        yogaTrainerCard.setOnClickListener { selectCard(yogaTrainerCard) }
        rekiMasterCard.setOnClickListener { selectCard(rekiMasterCard) }

        window.statusBarColor= ContextCompat.getColor(this,R.color.statusbar)
    }

    private fun selectCard(cardView: CardView) {
        // Check if this card is already selected
        if (cardView.id == selectedCardId) {
            // If already selected, deselect it and reset the card
            selectedCardId = -1
            resetCards()
            return
        }

        // Reset all card views to default state before selecting a new card
        resetCards()

        // Change background color of selected card
        cardView.setBackgroundResource(R.drawable.rectangle_gradient_s_light_blue_a700_e_blue_800_radius_9)

        // Perform actions based on which card is selected
        when (cardView.id) {

            R.id.linearColumndocto1r ->{
                val superviseImageView=cardView.findViewById<ImageView>(R.id.imageImage1)
                superviseImageView.setImageResource(R.drawable.whitesupervisor)
                val supervisorTextView=cardView.findViewById<TextView>(R.id.txtDoctor1)
                supervisorTextView.setTextColor(resources.getColor(R.color.white))
            }

            R.id.linearColumndoctor -> {
                // If doctor card is selected
                val doctorImageView = cardView.findViewById<ImageView>(R.id.imageImage)
                doctorImageView.setImageResource(R.drawable.whitedoctor) // Change to your doctor image with white background
                val doctorTextView = cardView.findViewById<TextView>(R.id.txtDoctor)
                doctorTextView.setTextColor(resources.getColor(R.color.white)) // Change to your desired text color resource


            }
            R.id.linearColumnyogatrain -> {
                // If yoga trainer card is selected
                val yogaImageView = cardView.findViewById<ImageView>(R.id.imageImageOne)
                yogaImageView.setImageResource(R.drawable.whiteyoga) // Change to your yoga image with white background
                val yogaTextView = cardView.findViewById<TextView>(R.id.txtYogatrainer)
                yogaTextView.setTextColor(resources.getColor(R.color.white)) // Change to your desired text color resource
            }
            R.id.linearColumnrekimaste -> {
                // If reiki master card is selected
                val reikiImageView = cardView.findViewById<ImageView>(R.id.imageImageTwo)
                reikiImageView.setImageResource(R.drawable.whiterekimaster) // Change to your reiki image with white background
                val reikiTextView = cardView.findViewById<TextView>(R.id.txtRekimaster)
                reikiTextView.setTextColor(resources.getColor(R.color.white)) // Change to your desired text color resource
            }
        }

        // Update selected card ID
        selectedCardId = cardView.id


        // Inside your onCreate method after initializing views
        val continueButton = findViewById<AppCompatButton>(R.id.btnContinue)
        continueButton.setOnClickListener {
            when (selectedCardId) {
                R.id.linearColumndocto1r -> {
                    val intent=Intent(this,LoginScreenActivity::class.java)
                    startActivity(intent)
                }
                R.id.linearColumndoctor -> {
                    val intent = Intent(this, LoginScreenActivity::class.java)
                    startActivity(intent)
                }
                R.id.linearColumnyogatrain -> {
                    val intent = Intent(this, LoginScreenForReki::class.java)
                    startActivity(intent)
                }
                R.id.linearColumnrekimaste -> {
                    val intent = Intent(this, LoginForYoga::class.java)
                    startActivity(intent)
                }
                else -> {
                    // If no card is selected, display a message or perform any other action
                    Toast.makeText(this, "Please select a card", Toast.LENGTH_SHORT).show()
                }
            }
        }

    }

    private fun resetCards() {
        // Reset background color to white for all card views
        supervisorCard.setBackgroundColor(resources.getColor(android.R.color.white))
        doctorCard.setBackgroundColor(resources.getColor(android.R.color.white))
        yogaTrainerCard.setBackgroundColor(resources.getColor(android.R.color.white))
        rekiMasterCard.setBackgroundColor(resources.getColor(android.R.color.white))


        val superImageview=supervisorCard.findViewById<ImageView>(R.id.imageImage1)
        superImageview.setImageResource(R.drawable.supervisor)
        // Reset image resources for doctorCard
        val doctorImageView = doctorCard.findViewById<ImageView>(R.id.imageImage)
        doctorImageView.setImageResource(R.drawable.doctor) // Change to your white doctor image resource

        // Reset image resources for yogaTrainerCard
        val yogaImageView = yogaTrainerCard.findViewById<ImageView>(R.id.imageImageOne)
        yogaImageView.setImageResource(R.drawable.yoga) // Change to your white yoga image resource

        // Reset image resources for rekiMasterCard
        val rekiImageView = rekiMasterCard.findViewById<ImageView>(R.id.imageImageTwo)
        rekiImageView.setImageResource(R.drawable.reki) // Change to your white reiki image resource

        val superVisorTextview=supervisorCard.findViewById<TextView>(R.id.txtDoctor1)
        superVisorTextview.setTextColor(resources.getColor(R.color.black))

        // Reset text color for all card views
        val doctorTextView = doctorCard.findViewById<TextView>(R.id.txtDoctor)
        doctorTextView.setTextColor(resources.getColor(R.color.black))

        val yogaTextView = yogaTrainerCard.findViewById<TextView>(R.id.txtYogatrainer)
        yogaTextView.setTextColor(resources.getColor(R.color.black))

        val rekiTextView = rekiMasterCard.findViewById<TextView>(R.id.txtRekimaster)
        rekiTextView.setTextColor(resources.getColor(R.color.black))


    }






    // Navigation functions remain unchanged
}


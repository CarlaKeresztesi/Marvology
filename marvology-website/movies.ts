import './src/style.scss'


const movieInputBox = document.querySelector<HTMLInputElement>('#moviesInput')
const moviesForm = document.querySelector<HTMLFormElement>('#moviesForm')
const moviesSelected = document.querySelector<HTMLDivElement>('.movies-container--selectedMovies')
const addMoveForm = document.querySelector<HTMLFormElement>('#addMovieForm')
const movieAddNameInput = document.querySelector<HTMLInputElement>('#movieAddName')
const movieAddYearInput = document.querySelector<HTMLInputElement>('#movieAddYear')

if(!movieInputBox || !moviesForm || !moviesSelected || !addMoveForm || !movieAddNameInput || !movieAddYearInput){
    throw new Error('couldnt find it!')
}

type Movie = {
    id : number,
    title : string,
    release_year : number
}

const handleMoveiPost = async (event : SubmitEvent) => {
    event?.preventDefault();

    const movieTitle = movieAddNameInput.value.trim();
    const movieYear = parseInt(movieAddYearInput.value);

    const movieData = {
        title: movieTitle,
        release_year: movieYear,
    };
    const response = await fetch("http://localhost:8080/movies/addMovie", {
            method: "POST",
            headers: { 
                "Content-Type": "application/json"
            },
            body: JSON.stringify(movieData),
        });

    const data = await response.json();
        console.log("Movie added successfully:", data);
}

const handleMovieSearch = async (event : SubmitEvent) => {
    event?.preventDefault();
    moviesSelected.innerHTML = "";
    const response = await fetch("http://localhost:8080/movies/");
    const arrOfMovies = await response.json();
    const inputValue = movieInputBox.value;
        console.log(inputValue);
        console.log("movieSearch");
        console.log(arrOfMovies);
        arrOfMovies.forEach((movie : Movie) => {
            const newInput = inputValue.toLowerCase();
            const newTitle = movie.title.toLowerCase();
            console.log("not in the if")
            console.log(newInput)
            console.log(movie.title)
            if (newTitle.includes(newInput)) {
                const movieText = document.createElement('p');
                movieText.className = 'movie-text';
                moviesSelected.appendChild(movieText);
                movieText.innerText = `${movie.title}`;
                console.log("in if stat")
            }
        } )
}

addMoveForm?.addEventListener("submit", handleMoveiPost)
moviesForm.addEventListener("submit", handleMovieSearch);
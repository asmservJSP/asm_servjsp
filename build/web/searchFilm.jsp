<!-- Search bar -->
        <div class="search-wrapper">
            <div class="container container--add">
                <form id='search-form' method='get' class="search" action="searchF">
                    <input type="text" class="search__field" name="search" placeholder="Search film">
                    <select name="sorting_item" id="search-sort" class="search__sort" tabindex="0">
                        <option value="id" selected='selected'>By id</option>
                        <option value="name">By name</option>
                        <option value="category">By category</option>
                    </select>
                    <button type='submit' class="btn btn-md btn--danger search__button">search a movie</button>
                </form>
            </div>
        </div>
